package com.azure.digitaltwins.core;

import com.azure.digitaltwins.core.implementation.models.ErrorResponseException;
import com.azure.digitaltwins.core.util.UpdateOperationUtility;
import org.opentest4j.AssertionFailedError;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

public class TestAssetsHelper {
    protected static int MAX_TRIES = 10;
    protected static int MAX_ID_LENGTH = 27;

    // Remove all new line characters as they are different in different Operaing Systems.
    // This will ensure that the recorded files always match the request in playback mode of tests.
    private static String removeNewLines(String payload)
    {
        return payload.replace(System.lineSeparator(), "");
    }

    public static String getFloorModelPayload(String floorModelId, String roomModelId, String hvacModelId)
    {
        return removeNewLines(readResourceFile("FloorModelPayload")
            .replace("FLOOR_MODEL_ID", floorModelId)
            .replace("ROOM_MODEL_ID", roomModelId)
            .replace("HVAC_MODEL_ID", hvacModelId));
    }

    public static String getRoomModelPayload(String roomModelId, String floorModelId)
    {
        return removeNewLines(readResourceFile("RoomModelPayload")
            .replace("ROOM_MODEL_ID", roomModelId)
            .replace("FLOOR_MODEL_ID", floorModelId));
    }

    public static String getHvacModelPayload(String hvacModelId, String floorModelId)
    {
        return removeNewLines(readResourceFile("HvacModelPayload")
            .replace("HVAC_MODEL_ID", hvacModelId)
            .replace("FLOOR_MODEL_ID", floorModelId));
    }

    public static String getBuildingModelPayload(String buildingModelId, String hvacModelId, String floorModelId)
    {
        return removeNewLines(readResourceFile("BuildingModelPayload")
            .replace("BUILDING_MODEL_ID", buildingModelId)
            .replace("HVAC_MODEL_ID", hvacModelId)
            .replace("FLOOR_MODEL_ID", floorModelId));
    }

    public static String getWardModelPayload(String wardModelId)
    {
        return removeNewLines(readResourceFile("WardModelPayload")
            .replace("WARD_MODEL_ID", wardModelId));
    }

    public static List<Object> getRoomTwinUpdatePayload()
    {
        UpdateOperationUtility uou = new UpdateOperationUtility();
        uou.appendAddOperation("/Humidity", 30);
        uou.appendReplaceOperation("/Temperature", 70);
        uou.appendRemoveOperation("/EmployeeId");
        return uou.getUpdateOperations();
    }

    public static List<Object> getWifiComponentUpdatePayload()
    {
        UpdateOperationUtility uou = new UpdateOperationUtility();
        uou.appendReplaceOperation("/Network", "New Network");
        return uou.getUpdateOperations();
    }

    public static String getFloorTwinPayload(String floorModelId)
    {
        return removeNewLines(readResourceFile("FloorTwinPayload")
            .replace("FLOOR_MODEL_ID", floorModelId));
    }

    public static String getRoomTwinPayload(String roomModelId)
    {
        return removeNewLines(readResourceFile("RoomTwinPayload")
            .replace("ROOM_MODEL_ID", roomModelId));
    }

    public static String getRelationshipPayload(String targetTwinId, String relationshipName)
    {
        return removeNewLines(readResourceFile("RelationshipPayload")
            .replace("TARGET_TWIN_ID", targetTwinId)
            .replace("RELATIONSHIP_NAME", relationshipName));
    }

    public static String getRelationshipWithPropertyPayload(String targetTwinId, String relationshipName, String propertyName, boolean propertyValue)
    {
        return removeNewLines(readResourceFile("RelationshipWithPropertyPayload")
            .replace("TARGET_TWIN_ID", targetTwinId)
            .replace("RELATIONSHIP_NAME", relationshipName)
            .replace("PROPERTY_NAME", propertyName)
            .replace("\"PROPERTY_VALUE\"", String.valueOf(propertyValue).toLowerCase()));
    }

    public static List<Object> getRelationshipUpdatePayload(String propertyName, boolean propertyValue)
    {
        UpdateOperationUtility uou = new UpdateOperationUtility();
        uou.appendReplaceOperation(propertyName, propertyValue);
        return uou.getUpdateOperations();
    }

    public static String getWifiModelPayload(String wifiModelId)
    {
        return removeNewLines(readResourceFile("WifiModelPayload")
            .replace("WIFI_MODEL_ID", wifiModelId));
    }

    public static String getRoomWithWifiModelPayload(String roomWithWifiModelId, String wifiModelId, String wifiComponentName)
    {
        return removeNewLines(readResourceFile("RoomWithWifiModelPayload")
            .replace("ROOM_WITH_WIFI_MODEL_ID", roomWithWifiModelId)
            .replace("WIFI_MODEL_ID", wifiModelId)
            .replace("WIFI_COMPONENT_NAME", wifiComponentName));
    }

    public static String getRoomWithWifiTwinPayload(String roomWithWifiModelId, String wifiComponentName)
    {
        return removeNewLines(readResourceFile("RoomWithWifiTwinPayload")
            .replace("ROOM_WITH_WIFI_MODEL_ID", roomWithWifiModelId)
            .replace("WIFI_COMPONENT_NAME", wifiComponentName));
    }

    public static String getHvacTwinPayload(String hvacModelId)
    {
        return removeNewLines(readResourceFile("HvacTwinPayload")
            .replace("HVAC_MODEL_ID", hvacModelId));
    }

    // This method assumes that the file name is a json file under the test-assets folder within the resources directory
    public static String readResourceFile(String fileName)
    {
        String resourceFileContents = "";
        try (InputStream inputStream = TestAssetsHelper.class.getResourceAsStream("/test-assets/" + fileName + ".json")) {
            Scanner s = new Scanner(inputStream);
            while (s.hasNext()) {
                resourceFileContents += s.next();
            }

            return resourceFileContents;
        } catch (IOException e) {
            throw new RuntimeException("Cannot find file " + fileName, e);
        }
    }

    public static String getUniqueModelId(DigitalTwinsClient dtClient, String baseName)
    {
        return getUniqueModelId(baseName, (id) -> dtClient.getModel(id));
    }

    public static String getUniqueDigitalTwinId(DigitalTwinsClient dtClient, String baseName)
    {
        return getUniqueModelId(baseName, (id) -> dtClient.getDigitalTwin(id));
    }

    public static String getUniqueModelId(DigitalTwinsAsyncClient dtClient, String baseName)
    {
        return getUniqueModelId(baseName, (id) -> dtClient.getModel(id).block());
    }

    public static String getUniqueDigitalTwinId(DigitalTwinsAsyncClient dtClient, String baseName)
    {
        return getUniqueModelId(baseName, (id) -> dtClient.getDigitalTwin(id).block());
    }

    private static String getUniqueModelId(String baseName, Consumer<String> getMethod)
    {
        String id;
        Random random = new Random();
        for (int i = 0; i < MAX_TRIES; ++i)
        {
            id = baseName + random.nextInt();
            id = id.length() > MAX_ID_LENGTH ? id.substring(0, MAX_ID_LENGTH) : id;
            try
            {
                getMethod.accept(id);
            }
            catch (ErrorResponseException e)
            {
                if (e.getResponse().getStatusCode() == HttpURLConnection.HTTP_NOT_FOUND)
                {
                    return id;
                }
            }
        }

        throw new AssertionFailedError("Unique Id could not be found with base " + baseName);
    }
}

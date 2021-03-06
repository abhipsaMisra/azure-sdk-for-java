/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.DataExports;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.DataExport;

class DataExportsImpl extends WrapperImpl<DataExportsInner> implements DataExports {
    private final LogAnalyticsManager manager;

    DataExportsImpl(LogAnalyticsManager manager) {
        super(manager.inner().dataExports());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public DataExportImpl define(String name) {
        return wrapModel(name);
    }

    private DataExportImpl wrapModel(DataExportInner inner) {
        return  new DataExportImpl(inner, manager());
    }

    private DataExportImpl wrapModel(String name) {
        return new DataExportImpl(name, this.manager());
    }

    @Override
    public Observable<DataExport> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        DataExportsInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<List<DataExportInner>, Observable<DataExportInner>>() {
            @Override
            public Observable<DataExportInner> call(List<DataExportInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DataExportInner, DataExport>() {
            @Override
            public DataExport call(DataExportInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DataExport> getAsync(String resourceGroupName, String workspaceName, String dataExportName) {
        DataExportsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, dataExportName)
        .flatMap(new Func1<DataExportInner, Observable<DataExport>>() {
            @Override
            public Observable<DataExport> call(DataExportInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DataExport)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String dataExportName) {
        DataExportsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, dataExportName).toCompletable();
    }

}

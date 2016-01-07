// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyComplex
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class ArrayExtensions
    {
            /// <summary>
            /// Get complex types with array property
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static ArrayWrapper GetValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get complex types with array property
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ArrayWrapper> GetValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                var _result = await operations.GetValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return _result.Body;
            }

            /// <summary>
            /// Put complex types with array property
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='array'>
            /// </param>
            public static void PutValid(this IArray operations, IList<string> array = default(IList<string>))
            {
                Task.Factory.StartNew(s => ((IArray)s).PutValidAsync(array), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put complex types with array property
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='array'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutValidAsync( this IArray operations, IList<string> array = default(IList<string>), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutValidWithHttpMessagesAsync(array, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get complex types with array property which is empty
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static ArrayWrapper GetEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get complex types with array property which is empty
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ArrayWrapper> GetEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                var _result = await operations.GetEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return _result.Body;
            }

            /// <summary>
            /// Put complex types with array property which is empty
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='array'>
            /// </param>
            public static void PutEmpty(this IArray operations, IList<string> array = default(IList<string>))
            {
                Task.Factory.StartNew(s => ((IArray)s).PutEmptyAsync(array), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put complex types with array property which is empty
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='array'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutEmptyAsync( this IArray operations, IList<string> array = default(IList<string>), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutEmptyWithHttpMessagesAsync(array, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get complex types with array property while server doesn't provide a
            /// response payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static ArrayWrapper GetNotProvided(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetNotProvidedAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get complex types with array property while server doesn't provide a
            /// response payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ArrayWrapper> GetNotProvidedAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                var _result = await operations.GetNotProvidedWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return _result.Body;
            }

    }
}

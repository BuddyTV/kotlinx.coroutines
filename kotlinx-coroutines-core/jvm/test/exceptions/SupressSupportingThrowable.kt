/*
 * Copyright 2016-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.exceptions

@Suppress("ACTUAL_WITHOUT_EXPECT")
internal actual typealias SuppressSupportingThrowable = Throwable

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
actual fun Throwable.printStackTrace() = printStackTrace()


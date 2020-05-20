package com.nei1even.adrcodingchallengelibrary.core.mvrx

import com.airbnb.mvrx.BaseMvRxViewModel
import com.airbnb.mvrx.BuildConfig
import com.airbnb.mvrx.MvRxState

abstract class MvRxViewModel<S : MvRxState>(initialState: S, debugMode: Boolean = BuildConfig.DEBUG) :
    BaseMvRxViewModel<S>(initialState, debugMode)
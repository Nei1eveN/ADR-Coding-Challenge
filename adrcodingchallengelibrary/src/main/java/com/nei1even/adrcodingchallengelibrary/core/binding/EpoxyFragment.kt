package com.nei1even.adrcodingchallengelibrary.core.binding

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.airbnb.epoxy.EpoxyRecyclerView
import com.nei1even.adrcodingchallengelibrary.core.mvrx.MvRxEpoxyController

abstract class EpoxyFragment<B : ViewDataBinding> : BindingMvRxFragment<B>() {

    abstract val recyclerView: EpoxyRecyclerView

    protected val epoxyController by lazy { epoxyController() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        epoxyController.onRestoreInstanceState(savedInstanceState)
    }

    override fun invalidate() {
        recyclerView.requestModelBuild()
    }

    /**
     * Provide the EpoxyController to use when building models for this Fragment.
     * Basic usages can simply use [simpleController]
     */
    abstract fun epoxyController(): MvRxEpoxyController

    /**
     * setting delay time from default (2sec) to 0sec otherwise app crash because view already bounded.
     * Link for this issue: https://github.com/airbnb/epoxy/issues/736
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.setController(epoxyController)
        recyclerView.setDelayMsWhenRemovingAdapterOnDetach(0)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        epoxyController.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        epoxyController.cancelPendingModelBuild()
        super.onDestroyView()
    }

}
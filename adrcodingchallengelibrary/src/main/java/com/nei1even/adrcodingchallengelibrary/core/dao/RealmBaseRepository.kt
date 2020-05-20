package com.nei1even.adrcodingchallengelibrary.core.dao

import io.realm.Realm

abstract class RealmBaseRepository(private val realmInstance: Realm = Realm.getDefaultInstance()) {

    val realm get() = realmInstance

    fun closeRealm() {
        realmInstance.close()
    }
}
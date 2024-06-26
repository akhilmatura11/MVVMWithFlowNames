package com.mvvm.flows.data.remotedatasource

import com.mvvm.flows.data.names.Names

object RemoteData {
    fun fetchNames(): List<Names> {
        return listOf(
            Names("elon musk"),
            Names("bernard arnault"),
            Names("jeff bezos"),
            Names("bill gates"),
            Names("gautam adani"),
            Names("warren buffett"),
            Names("larry ellison"),
            Names("larry page"),
            Names("sergey brin"),
            Names("steve ballmer")
        )
    }

}

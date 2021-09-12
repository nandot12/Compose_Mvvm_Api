package com.ercode.udacoding.alibabapos.pages.pelanggan.repo

import com.biskita.composemvvmapi.data.NewsData
import com.ercode.udacoding.alibabapos.pages.pelanggan.configNetwork.ApiService
import com.ercode.udacoding.alibabapos.pages.pelanggan.configNetwork.NetworkConfig
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class RepoNews {

    val api = NetworkConfig.getService()
    val compose = CompositeDisposable()

    fun getNews(q: String, from: String, apikEY: String,responseHandler : (NewsData) -> Unit, errorHandler : (Throwable) -> Unit) {

        compose.add(api.getNews(q, from, apikEY).observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                       responseHandler(it)
            }, {errorHandler(it)})
        )
    }


}
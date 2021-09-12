package com.biskita.composemvvmapi.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.biskita.composemvvmapi.data.NewsData
import com.ercode.udacoding.alibabapos.pages.pelanggan.repo.RepoNews
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class NewsViewModel : ViewModel() {

    private var repo = RepoNews()

    private var _dataNews = MutableLiveData<NewsData>()
    var dataNews: LiveData<NewsData>? = _dataNews
    private var _onError = MutableLiveData<Throwable>()
    var onError: LiveData<Throwable>? = _onError

    private var _isLoading = MutableLiveData<Boolean>()
    var isLoading: LiveData<Boolean>? = _isLoading




    fun getNews(q: String, from: String) {
        _isLoading.value = true
        repo.getNews(q, from, "", {
            _isLoading.value = false
            _dataNews.value = it
        }, {
            _isLoading.value = false
            _onError.value = it
        })
    }


}
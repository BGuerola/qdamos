package com.justaproject.qdamos.ui.perfil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PerfilViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment del perfil"
    }
    val text: LiveData<String> = _text
}
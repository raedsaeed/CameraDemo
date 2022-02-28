package com.raed.camerademo

import android.view.Surface
import androidx.camera.core.Preview
import androidx.camera.core.SurfaceRequest
import java.util.concurrent.Executor


/**
 * Created By Raed Saeed on 27/02/2022
 */
class PreviewSurfaceProvider(private val surface: Surface, private val executor: Executor) :
    Preview.SurfaceProvider {
    override fun onSurfaceRequested(request: SurfaceRequest) {
        request.provideSurface(surface, executor, {

        })
    }

}
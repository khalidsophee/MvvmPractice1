package com.example.mvvmpractice
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver:LifecycleObserver
{
    private val Tag = this.javaClass.simpleName

   @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
   fun onCreateEvent()
    {
       Log.v(Tag,"observer onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartEvent()
    {
        Log.v(Tag,"observer onstart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseEvent()
    {
        Log.v(Tag,"observer onpause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent()
    {
        Log.v(Tag,"observer onreume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopEvent()
    {
        Log.v(Tag,"observer onstop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyEvent()
    {
        Log.v(Tag,"observer ondestroy")
    }
}
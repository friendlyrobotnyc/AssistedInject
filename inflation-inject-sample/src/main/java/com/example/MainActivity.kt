package com.example

import android.app.Activity
import android.os.Bundle
import com.squareup.inject.inflation.InflationInjectFactory
import dagger.Component

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val factory = DaggerMainActivity_MainComponent.create()
        .factory()
    layoutInflater.factory = factory

    setContentView(R.layout.custom_view)
  }

  @Component(modules = arrayOf(ViewModule::class))
  internal interface MainComponent {
    fun factory(): InflationInjectFactory
  }
}

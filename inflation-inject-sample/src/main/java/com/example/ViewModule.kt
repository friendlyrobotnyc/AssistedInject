package com.example

import com.squareup.inject.inflation.InflationModule
import dagger.Module

@InflationModule
@Module(includes = arrayOf(InflationInject_ViewModule::class))
abstract class ViewModule

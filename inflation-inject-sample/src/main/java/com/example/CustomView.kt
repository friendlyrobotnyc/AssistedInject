package com.example

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.inflation.InflationInject
import kotlinx.android.synthetic.main.custom_view.view.input
import kotlinx.android.synthetic.main.custom_view.view.output
import kotlinx.android.synthetic.main.custom_view.view.show

@SuppressLint("ViewConstructor") // Created by Inflation Inject.
class CustomView @InflationInject
constructor(@Assisted context: Context, @Assisted attrs: AttributeSet, private val greeter: Greeter) :
    LinearLayout(context, attrs) {

  override fun onFinishInflate() {
    super.onFinishInflate()
    show.setOnClickListener({ view ->
      val inputText = input.text.toString()
      val outputText = greeter.sayHi(inputText)
      output.text = outputText
    })
  }
}

package com.example

import javax.inject.Inject

class Greeter @Inject internal constructor() {

  fun sayHi(name: String): String {
    return "Hello, $name!"
  }
}

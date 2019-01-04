package com.example.broze.test

open class BookLog {
    var title:String = ""
    var author:String = ""
    var pages:Long? = null
constructor(title:String, author:String, pages:Long?){
    this.title = title
    this.author = author
    this.pages = pages
}
}


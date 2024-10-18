package com.iAMashad.chatappui.data


data class Chat(
    val id:Int,
    val message:String,
    val time:String,
    val direction:Boolean
)

val chatList = listOf(
    Chat(
        1,
        "Hey! How have you been?",
        "12:15 PM",
        true
    ),
    Chat(
        2,
        "When are your vacations?",
        "12:17 PM",
        true
    ),
    Chat(
        3,
        "In December!",
        "12:19 PM",
        false
    ),
    Chat(
        4,
        "Book my tickets for me?",
        "12:20 PM",
        false
    ),
    Chat(
        5,
        "Yeah sure!",
        "12:21 PM",
        true
    ),
    Chat(
        6,
        "Thanks! How have you been?",
        "12:15 PM",
        false
    ),
    Chat(
        7,
        "I am doing great! What about you?",
        "12:17 PM",
        true
    ),
    Chat(
        8,
        "Pretty occupied with work to be honest!",
        "12:19 PM",
        false
    ),
    Chat(
        9,
        "Take care of yourself!",
        "12:20 PM",
        true
    ),
    Chat(
        10,
        "Yup don't worry!",
        "12:21 PM",
        false
    ),
)
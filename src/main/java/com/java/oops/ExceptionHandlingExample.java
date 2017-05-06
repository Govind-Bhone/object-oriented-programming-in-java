package com.java.oops;

/**
 * Created by govind.bhone on 5/5/2017.
 */
/*
                                        Throwable
                                           |
                                           |
                   ------------------------------------------------------------------------------------------------
                   |                                                                                               |
                   |                                                                                                Error
                Exception                                                                           VMError----------------------------------------
                   |                                                                                  |                                           |
                   |                                                                                  |--OutOFMemoryError
 -----------------------------------------------------------------------------------------------      |--StackOverflowError
RuntimeException      IO Exception          Interrupted Exception  Servlet ex   Remote ex
 |                     |
 |--NPE                |---File not found
 |--CCE                |---EOF exception
 |--AE                 |
 |
 |

Checked Exception    : Except below two categories others are checked exceptions

UnChecked Exception  : Runtime Exception and its child classes + Error and its child classes




 */
public class ExceptionHandlingExample {
}

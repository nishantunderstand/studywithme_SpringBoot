WITHOUT join()

Main Thread: "t1, start working."
Main Thread: "Okay, I'll immediately print the count."
t1:          "But I'm still working!"


WITH join()

Main Thread: "t1, start working."
Main Thread: "I'll wait for you."
t1:          "I'm done."
Main Thread: "Okay, now I'll print the count."
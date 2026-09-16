count = 1

        ┌──────────────┐
        │    count     │
        │      1       │
        └──────┬───────┘
               │
        ┌──────▼───────┐
        │ Is it my turn│
        └──────┬───────┘
          Yes  │   No
          ┌────┘    └──────┐
          ▼                ▼
       print()            wait()
          │
          ▼
       count++
          │
          ▼
       notifyAll()
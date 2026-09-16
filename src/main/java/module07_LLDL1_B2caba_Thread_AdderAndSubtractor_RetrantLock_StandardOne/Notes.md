Standard Pattern
```
void increment() {
    LOCK.lock();
    try {
        System.out.println("Count : " + count);
        count++;
    } finally {
        LOCK.unlock();
    }
}
```
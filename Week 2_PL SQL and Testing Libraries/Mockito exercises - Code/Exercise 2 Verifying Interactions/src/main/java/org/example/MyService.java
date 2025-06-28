package org.example;

public class MyService {
    private final ExternalAPI api;

    public MyService(ExternalAPI api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData();
    }
}

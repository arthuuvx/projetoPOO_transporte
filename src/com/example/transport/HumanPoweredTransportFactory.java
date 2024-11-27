package com.example.transport;

public class HumanPoweredTransportFactory implements TransportFactory {
    @Override
    public Transport createScooter() {
        throw new UnsupportedOperationException("Scooter não disponível para esforço humano.");
    }

    @Override
    public Transport createBike() {
        return new Bicycle();
    }

    public Transport createRollerSkates() {
        return new RollerSkates();
    }

    public Transport createSkateboard() {
        return new Skateboard();
    }
}

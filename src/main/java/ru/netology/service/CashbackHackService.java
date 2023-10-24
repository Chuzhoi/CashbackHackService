package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
// Здравствуйте, я прерывл обучение на этом модуле, это задание у меня было сделано)

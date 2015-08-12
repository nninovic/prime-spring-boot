package co.prime.springboot.service;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * User: n.ninovic
 * Date: 12.08.2015
 * Time: 14:11
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public int getRandomNumber() {
        return new Random().nextInt();
    }
}

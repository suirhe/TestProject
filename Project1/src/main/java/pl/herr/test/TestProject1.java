package pl.herr.test;

import org.springframework.retry.support.RetryTemplate;

public class TestProject1 {
    public static void main(String[] args) {
        System.out.println("Hello 34!");
        System.out.println("Szalona zmiana");
        
        RetryTemplate template = new RetryTemplate();
        System.out.println("conflict change");
    }
}

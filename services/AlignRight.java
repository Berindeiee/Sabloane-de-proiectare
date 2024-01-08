package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.services.AlignStrategy;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("##" + text);
    }
}

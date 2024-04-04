package org.example.N_37_Functional.CliArguments;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CliArgumentsUtils {
    static void showHelp(CliArguments cliArguments){
        Consumer<CliArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }else {
                System.out.println("Manual no solicitado");
            }
        };
        consumerHelper.accept(cliArguments);
    }

    static CliArguments generateCli(){
        Supplier<CliArguments> generator= CliArguments::new;
        return generator.get();
    }
}

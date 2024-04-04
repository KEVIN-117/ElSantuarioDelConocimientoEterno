package org.example.N_37_Functional.CliArguments;

public class Main {
    public static void main(String[] args) {
        CliArguments cliArguments = CliArgumentsUtils.generateCli();
        CliArgumentsUtils.showHelp(cliArguments);
    }
}

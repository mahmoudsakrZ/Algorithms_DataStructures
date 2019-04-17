package DesignPattern.Command.exam;

class Program {
    String exec(String cmd, String text){
        CommandFactory commandFactory = new CommandFactory();
        Command command = commandFactory.getCommand(cmd);
        return command.exec(text);
    }
}

class CommandFactory {
    public Command getCommand(String cmd){
        if(cmd.equals("CountWords")) return new CountWords();
        else throw new IllegalArgumentException(cmd);
    }
}


interface Command {
    String exec(String text);
}


class CountWords implements Command{

    @Override
    public String exec(String text) {
        return String.valueOf(text.length());
    }

}

###################################################################################
class ProgramTester {
    static Program p;

    static void init(){
        p = new Program();
    }

    static void textCountWords(){
        String s = p.exec("CountWords", "Yes we code");
        assert (s.equals("J"));
    }
}


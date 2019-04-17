package DesignPattern.Command.goodExample;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        System.out.println(editor.clipboard);
        return false;
    }
}
package j27_Interface.Tasks.Task07;

public class DMGFile implements ReadFile {

    @Override
    public String open() {
        return "opening.dmg";
    }

    @Override
    public String read() {
        return "reading.dmg";
    }

    @Override
    public String save() {
        return "saving.dmg";
    }

    @Override
    public String close() {
        return "closing.dmg";
    }
}

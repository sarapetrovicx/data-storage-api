package paket;

public class DriveManager {
    private static Specification specification;

    public static void registerDrive(Specification spec) {
            specification = spec;
    }
    public static Specification getDrive(String path) {
        specification.setRootPath(path);
        return specification;
    }
}

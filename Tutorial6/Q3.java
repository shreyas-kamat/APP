// Q3: Interface inheritance - AdvancedSecurity extends BasicSecurity

interface BasicSecurity {
    void login(String username, String password);
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuth(String fingerprintId);
    void faceRecognitionAuth(String faceId);
}

class BankingApplication implements AdvancedSecurity {
    private String appName;
    private String registeredUser;
    private String registeredPassword;
    private String registeredFingerprint;
    private String registeredFace;
    private boolean loggedIn;

    BankingApplication(String appName, String registeredUser, String registeredPassword,
                       String registeredFingerprint, String registeredFace) {
        this.appName = appName;
        this.registeredUser = registeredUser;
        this.registeredPassword = registeredPassword;
        this.registeredFingerprint = registeredFingerprint;
        this.registeredFace = registeredFace;
        this.loggedIn = false;
    }

    @Override
    public void login(String username, String password) {
        if (registeredUser.equals(username) && registeredPassword.equals(password)) {
            loggedIn = true;
            System.out.println("[" + appName + "] Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("[" + appName + "] Login failed. Invalid username or password.");
        }
    }

    @Override
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("[" + appName + "] Logged out successfully. Session closed.");
        } else {
            System.out.println("[" + appName + "] No active session to log out from.");
        }
    }

    @Override
    public void fingerprintAuth(String fingerprintId) {
        if (registeredFingerprint.equals(fingerprintId)) {
            loggedIn = true;
            System.out.println("[" + appName + "] Fingerprint matched. Authentication successful.");
        } else {
            System.out.println("[" + appName + "] Fingerprint mismatch. Authentication denied.");
        }
    }

    @Override
    public void faceRecognitionAuth(String faceId) {
        if (registeredFace.equals(faceId)) {
            loggedIn = true;
            System.out.println("[" + appName + "] Face recognised. Authentication successful.");
        } else {
            System.out.println("[" + appName + "] Face not recognised. Authentication denied.");
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        BankingApplication app = new BankingApplication(
                "SecureBank", "shreyas", "pass@123", "FP-9021", "FACE-4457");

        System.out.println("=== Basic Security Operations ===");
        app.login("shreyas", "wrongpass");
        app.login("shreyas", "pass@123");
        app.logout();
        System.out.println();

        System.out.println("=== Advanced Security Operations ===");
        app.fingerprintAuth("FP-0000");
        app.fingerprintAuth("FP-9021");
        app.logout();
        app.faceRecognitionAuth("FACE-4457");
        app.logout();
        System.out.println();

        // An AdvancedSecurity reference can access the inherited basic operations too
        AdvancedSecurity secureApp = app;
        System.out.println("=== Through AdvancedSecurity Reference ===");
        secureApp.login("shreyas", "pass@123");
        secureApp.faceRecognitionAuth("FACE-1111");
        secureApp.logout();
        System.out.println();

        // A BasicSecurity reference sees only login/logout
        BasicSecurity basicApp = app;
        System.out.println("=== Through BasicSecurity Reference ===");
        basicApp.login("shreyas", "pass@123");
        basicApp.logout();
    }
}

# Desktop Clock

A small Java Swing digital clock with a transparent, undecorated, always-on-top window. It displays local system time in 12-hour `hh:mm:ss a` format and updates once per second.

## Controls

- Drag the clock label to move the window.
- Click **exit** to close the app.
- The initial window position is hardcoded to `(1000, 0)`; on a narrow display it may start outside the visible area.

## Build and run

Install a Java JDK (Java 8 or later for the syntax used) and run in a graphical desktop session. From the repository directory on Linux/macOS:

```bash
javac -cp AbsoluteLayout-RELEASE130.jar -d out src/clockGUI.java
java -cp "out:AbsoluteLayout-RELEASE130.jar" clockGUI
```

On Windows, use `;` instead of `:` in the runtime classpath:

```bat
java -cp "out;AbsoluteLayout-RELEASE130.jar" clockGUI
```

The bundled NetBeans AbsoluteLayout JAR is required by the UI; no Maven or Gradle build is configured.

## Notes

All source is in [`src/clockGUI.java`](src/clockGUI.java). Transparent-window support depends on the desktop environment. The timer loop updates Swing labels outside the event-dispatch thread, so this is a learning example rather than a recommended threading pattern. Current desktop rendering and startup behavior have not been runtime-tested for this documentation refresh.

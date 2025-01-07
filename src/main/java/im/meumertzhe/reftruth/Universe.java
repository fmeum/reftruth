package im.meumertzhe.reftruth;

import javax.annotation.Nullable;

import static com.google.common.truth.Truth.assertAbout;
import static im.meumertzhe.reftruth.ReferenceSubject.references;

public final class Universe {
  public static Universe of(Object... roots) {
    return null;
  }

  public ReferenceSubject assertThat(@Nullable Object actual) {
    return assertAbout(references(this)).that(actual);
  }
}

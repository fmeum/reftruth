package im.meumertzhe.reftruth;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;
import org.jspecify.annotations.Nullable;

public final class ReferenceSubject extends Subject {
  private final Universe universe;
  @Nullable private final Object actual;

  private ReferenceSubject(Universe universe, FailureMetadata metadata, @Nullable Object actual) {
    super(metadata, actual);
    this.universe = universe;
    this.actual = actual;
  }

  public static Factory<ReferenceSubject, Object> references(Universe universe) {
    return (failureMetadata, actual) -> new ReferenceSubject(universe, failureMetadata, actual);
  }
}

package im.meumertzhe.reftruth;

import static com.google.common.truth.ExpectFailure.expectFailureAbout;
import static com.google.common.truth.Truth.assertThat;

import com.google.common.truth.ExpectFailure.SimpleSubjectBuilderCallback;
import org.junit.jupiter.api.Test;

public final class ReferenceSubjectTest {

  @Test
  public void id() {
    assertThat(1).isEqualTo(2);
  }

  private static AssertionError expectFailure(
      Universe universe, SimpleSubjectBuilderCallback<ReferenceSubject, Object> callback) {
    return expectFailureAbout(ReferenceSubject.references(universe), callback);
  }
}

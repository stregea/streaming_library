package com.streaming.library.model.util;

/**
 * //todo: make less ai and verbose
 *
 * Test contract for unit tests validating Java {@code record} types.
 *
 * <p>Implementing classes should provide a concrete test that verifies the
 * basic invariants and behaviour of a record, for example:
 * <ul>
 *   <li>construction and accessor methods</li>
 *   <li>equals() and hashCode() consistency</li>
 *   <li>toString() has a meaningful representation</li>
 * </ul>
 *
 * <p>The overriding implementation should be annotated with {@code @Test}
 * (JUnit Jupiter) so the test runner discovers and executes it. Example:
 *
 * <pre>{@code
 * public class TeamTest implements RecordTest {
 *     @Test
 *     @Override
 *     public void testRecord() {
 *         // perform assertions for the record under test
 *     }
 * }
 * }</pre>
 *
 * <p>This interface is intentionally minimal so it can be reused across the
 * test-suite as a common contract for record validation.
 */
public interface RecordTest {
    /**
     * Execute assertions validating the tested record.
     *
     * <p>Implementations must annotate the overriding method with {@code @Test}
     * so it is executed by the test framework.
     */
    void testRecord();
}

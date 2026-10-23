package com.streaming.library.model.util;

/**
 * Test contract for unit tests validating Java {@code record} types.
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

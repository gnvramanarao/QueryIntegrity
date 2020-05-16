/**
 * Class used to validate the result of different queries on system under test.
 * Validator is the class used to send result to the system under test and compare the result.
 *
 * @param <R> class of result used for the system under test.
 */
public interface ResultValidator<R> {
    /**
     * Check if result of 2 queries are equal
     *
     * @param result1 the first result
     * @param result2 the second result
     * @return true if 2 results are equal
     */
    public boolean isEquals(R result1, R result2);

    /**
     * Check if result of 2 queries are intersected,
     * e.g: there is an nonempty result that is subset of the result of both queries.
     *
     * @param result1 the first result
     * @param result2 the second result
     * @return true if 2 results share an non empty subset.
     */
    public boolean isIntersected(R result1, R result2);

    /**
     * Check if result of 1 result is the subset of other
     *
     * @param result1 the result could be subset
     * @param result2 the result could be superset
     * @return true if result1 is the subset of result2
     */
    public boolean isSubset(R result1, R result2);
}

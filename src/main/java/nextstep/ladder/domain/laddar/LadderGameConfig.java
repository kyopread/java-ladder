package nextstep.ladder.domain.laddar;

import nextstep.ladder.domain.strategy.DirectionStrategy;

import java.util.Objects;

public class LadderGameConfig {
    public static final int EXCLUDE_FIRST_AND_LAST_COUNT = 2;

    private final LadderSize ladderSize;
    private final DirectionStrategy directionStrategy;

    private LadderGameConfig(final LadderSize ladderSize, final DirectionStrategy directionStrategy) {
        this.ladderSize = ladderSize;
        this.directionStrategy = directionStrategy;
    }

    public static LadderGameConfig of(final LadderSize ladderSize, final DirectionStrategy directionStrategy) {
        return new LadderGameConfig(Objects.requireNonNull(ladderSize), Objects.requireNonNull(directionStrategy));
    }

    public int getWidth() {
        return ladderSize.getWidth();
    }

    public int getHeight() {
        return ladderSize.getHeight();
    }

    public int getMiddleSize() {
        return getWidth() - EXCLUDE_FIRST_AND_LAST_COUNT;
    }

    public DirectionStrategy getDirectionStrategy() {
        return directionStrategy;
    }
}

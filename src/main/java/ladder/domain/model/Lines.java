package ladder.domain.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lines {
    List<Line> lines;

    public Lines(int personCount, int ladderHeight) {
        lines = IntStream.range(0, ladderHeight)
                .mapToObj(i -> {
                    Line line = new Line();
                    line.calculatorLine(personCount);
                    return line;
                })
                .collect(Collectors.toList());
    }

    public Lines(List<Line> lines) {
        this.lines = lines;
    }

    public List<Line> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "LadderGame{" +
                "lines=" + lines +
                '}';
    }
}

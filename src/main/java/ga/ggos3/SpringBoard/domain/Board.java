package ga.ggos3.SpringBoard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private Long boardId;
    private String title;
    private String content;
    private String name;
    private LocalDate createDate;
    private int read;
    private Long memberId;
}

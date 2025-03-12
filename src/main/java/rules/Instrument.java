package rules;


import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Instrument {
    private Boolean isStart = true;
    private Boolean isPercussion = null;
    private Boolean hasResonatorHole = null;
    private Boolean isPlucked = null;          // Это инструмент щипкового типа?
    private Boolean isStruck = null;           // Это инструмент ударного типа?
    private Boolean isBow = null;              // Это инструмент смыкового типа?
    private Boolean isWindDriven = null;       // Струны этого инструмента колеблятся благодаря ветру?

    private Boolean isPlayedSitting = null;    // На нём играют только сидя?
    private Boolean isPlayedStanding = null;    // На нём играют только стоя?
    private Boolean hasHighestSound = null;     // Среди смычковых инструментов имеет самое высокое звучание?

    private Boolean areStringsVertical = null;  // На этом инструменте струны расположены вертикально?
    private Boolean isHammered = null;          // Звук извлекается посредством ударов молоточка благодаря клавиш?

    private Boolean hasResonator = null;        // Этот инструмент имеет резонаторное отверстие?
    private Boolean hasThickStrings = null;     // Этот инструмент имеет очень толстый калибр струн?
    private Boolean hasNylonStrings = null;     // Этот инструмент имеет нейлоновые струны?

    private Boolean hasPickups = null;          // Этот инструмент имеет звукосниматели?
    private Boolean hasFourStrings = null;      // Этот инструмент имеет 4 струны?
    private Boolean isStandalone = null;        // Этот инструмент самостоятелен без предусилителя?
}

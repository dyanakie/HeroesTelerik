package heroes.telerik.main.hero;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum HeroClass {
    WARLOCK,MAGE,BARBARIAN,DRUID,PALADIN;

    private static final List<HeroClass> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static HeroClass  randomHeroClass()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}

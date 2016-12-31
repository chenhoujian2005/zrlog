package com.fzb.blog.web.plugin.type;

/**
 * 定义常见的自动检查更新检查周期。
 * 使用秒为单位，而不是毫秒
 */
public enum AutoUpgradeVersionType {

    NEVER(-1), ONE_DAY(86400), ONE_WEEK(604800), HALF_MONTH(1296000);

    private int cycle;

    AutoUpgradeVersionType(int cycle) {
        this.cycle = cycle;
    }

    public static AutoUpgradeVersionType cycle(int cycle) {
        if (cycle == -1) {
            return AutoUpgradeVersionType.NEVER;
        } else if (cycle == 86400) {
            return AutoUpgradeVersionType.ONE_DAY;
        } else if (cycle == 604800) {
            return AutoUpgradeVersionType.ONE_WEEK;
        } else {
            return AutoUpgradeVersionType.HALF_MONTH;
        }
    }

    public int getCycle() {
        return cycle;
    }
}

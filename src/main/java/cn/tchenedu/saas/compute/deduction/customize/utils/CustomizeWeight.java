package cn.tchenedu.saas.compute.deduction.customize.utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ckzhang on 2017/10/21.
 */
public class CustomizeWeight {

    public static Map<String,Integer> SUBJECT_WEIGHT_MAP;


    public static Map<String,Integer> COMPOSE_WEIGHT_MAP;


    static {
        if(true) {
            SUBJECT_WEIGHT_MAP = new HashMap<>();
            SUBJECT_WEIGHT_MAP.put("物理", 1 << 6);
            SUBJECT_WEIGHT_MAP.put("化学", 1 << 5);
            SUBJECT_WEIGHT_MAP.put("生物", 1 << 4);
            SUBJECT_WEIGHT_MAP.put("政治", 1 << 3);
            SUBJECT_WEIGHT_MAP.put("地理", 1 << 2);
            SUBJECT_WEIGHT_MAP.put("历史", 1 << 1);
            SUBJECT_WEIGHT_MAP.put("技术", 1 << 0);
        }
        if (true){
            COMPOSE_WEIGHT_MAP = new HashMap<>();

            // 物理+生物+政治
            COMPOSE_WEIGHT_MAP.put("2727747",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("政治"));

            // 物理+生物+地理
            COMPOSE_WEIGHT_MAP.put("2618045",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("地理"));

            // 物理+生物+历史
            COMPOSE_WEIGHT_MAP.put("2580755",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 物理+化学+生物
            COMPOSE_WEIGHT_MAP.put("2579191",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("化学"));

            // 生物+政治+地理
            COMPOSE_WEIGHT_MAP.put("2511708",SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("地理"));

            // 物理+政治+地理
            COMPOSE_WEIGHT_MAP.put("2490607",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("地理"));

            // 生物+政治+历史
            COMPOSE_WEIGHT_MAP.put("2474418",SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 化学+生物+政治
            COMPOSE_WEIGHT_MAP.put("2472854",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("政治"));

            // 物理+政治+历史
            COMPOSE_WEIGHT_MAP.put("2453317",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 物理+化学+政治
            COMPOSE_WEIGHT_MAP.put("2451753",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("政治"));

            // 生物+地理+历史
            COMPOSE_WEIGHT_MAP.put("2364716",SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 化学+生物+地理
            COMPOSE_WEIGHT_MAP.put("2363152",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("地理"));

            // 物理+地理+历史
            COMPOSE_WEIGHT_MAP.put("2343615",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 物理+化学+地理
            COMPOSE_WEIGHT_MAP.put("2342051",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("地理"));

            // 化学+生物+历史
            COMPOSE_WEIGHT_MAP.put("2325862",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 物理+化学+历史
            COMPOSE_WEIGHT_MAP.put("2304761",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 政治+地理+历史
            COMPOSE_WEIGHT_MAP.put("2237278",SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 化学+政治+地理
            COMPOSE_WEIGHT_MAP.put("2235714",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("地理"));

            // 化学+政治+历史
            COMPOSE_WEIGHT_MAP.put("2198424",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 化学+地理+历史
            COMPOSE_WEIGHT_MAP.put("2088722",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("历史"));

            // 物理+生物+技术
            COMPOSE_WEIGHT_MAP.put("1130516836",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 生物+政治+技术
            COMPOSE_WEIGHT_MAP.put("1130410499",SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 物理+政治+技术
            COMPOSE_WEIGHT_MAP.put("1130389398",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 生物+地理+技术
            COMPOSE_WEIGHT_MAP.put("1130300797",SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 物理+地理+技术
            COMPOSE_WEIGHT_MAP.put("1130279696",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 生物+历史+技术
            COMPOSE_WEIGHT_MAP.put("1130263507",SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("历史") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 化学+生物+技术
            COMPOSE_WEIGHT_MAP.put("1130261943",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("生物") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 物理+历史+技术
            COMPOSE_WEIGHT_MAP.put("1130242406",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("历史") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 物理+化学+技术
            COMPOSE_WEIGHT_MAP.put("1130240842",SUBJECT_WEIGHT_MAP.get("物理") + SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 政治+地理+技术
            COMPOSE_WEIGHT_MAP.put("1130173359",SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 政治+历史+技术
            COMPOSE_WEIGHT_MAP.put("1130136069",SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("历史") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 化学+政治+技术
            COMPOSE_WEIGHT_MAP.put("1130134505",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("政治") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 地理+历史+技术
            COMPOSE_WEIGHT_MAP.put("1130026367",SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("历史") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 化学+地理+技术
            COMPOSE_WEIGHT_MAP.put("1130024803",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("地理") + SUBJECT_WEIGHT_MAP.get("技术"));

            // 化学+历史+技术
            COMPOSE_WEIGHT_MAP.put("1129987513",SUBJECT_WEIGHT_MAP.get("化学") + SUBJECT_WEIGHT_MAP.get("历史") + SUBJECT_WEIGHT_MAP.get("技术"));

        }
    }


    public static void main(String[] aa){
        System.out.println(JSON.toJSONString(SUBJECT_WEIGHT_MAP));
        System.out.print(JSON.toJSONString(COMPOSE_WEIGHT_MAP));
    }

}

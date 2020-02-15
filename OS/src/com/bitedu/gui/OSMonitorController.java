package com.bitedu.gui;

import com.bitedu.osm.OSResource;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeTableView;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class OSMonitorController {
    @FXML private LineChart cpuChart;
    @FXML private TreeTableView fileStat;
    private TimerTask timerTask=null;
    private Timer timer=new Timer();
    private Stage primaryStage

    public OSMonitorController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    // CPU 占有率事件处理方法
    public void handleCPUSelectionChanged(Event event) {

        Tab tab = (Tab) event.getTarget();
        if (tab.isSelected()) {
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    OSResource.XYPair[] xyPairs = OSResource.getCPUPercetage();
                    XYChart.Series series = new XYChart.Series();
                    for (OSResource.XYPair xyPair : xyPairs) {
                        XYChart.Data data = new XYChart.Data(xyPair.getX(), xyPair.getY());
                        series.getData().add(data);
                    }

                    Platform.runLater(
                            () -> {
                                if (cpuChart.getData().size() > 0) {
                                    cpuChart.getData().remove(0);
                                }
                                cpuChart.getData().add(series);
                            }
                    );
                }
            };

            timer.schedule(timerTask, 0, 1000);
        }
        else{

        }
        //切换tab页 获取一个cpu占有率值
        //System.out.println("Tab select cpu="+ OSResource.getCPUPercetage());



        // 1. 创建一个定时器，每隔一秒获取一次 CPU 资源绘制曲线图
        // 2. 绘制 LineChart

        //测试切换tab页 得到响应输出
        //System.out.println("Tab selected");
    }



    // 磁盘目录扫描事件处理方法
    public void handleSelectFile(ActionEvent actionEvent) {


        // 1. 打开文件选择对话框
        // 2. 开启磁盘目录扫描线程
        // 3. 渲染TreeTableView

        //测试按下按钮 得到响应输出
        System.out.println("Button action");

        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.
    }

}

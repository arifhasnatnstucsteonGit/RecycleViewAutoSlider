//package com.arifhasnat.recyclerviewslider.helpers;
//
//import java.util.TimerTask;
//
//public class AutoScrollTask extends TimerTask {
//    public int position=0;
//
//        @Override
//        public void run() {
//            if(position == arrayList.size() -1){
//                end = true;
//            } else if (position == 0) {
//                end = false;
//            }
//            if(!end){
//                position++;
//            } else {
//                position--;
//            }
//            recyclerView.smoothScrollToPosition(position);
//        }
//    }
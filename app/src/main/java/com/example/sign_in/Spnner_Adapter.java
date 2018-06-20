package com.example.sign_in;

import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Spnner_Adapter extends BaseAdapter {
        List<String> datas = new ArrayList<>();
        Context mContext;
        public Spnner_Adapter(Context context) {
            this.mContext = context;
        }

        public void setDatas(List<String> datas) {
            this.datas = datas;
            notifyDataSetChanged();
        }

        @Override
        public int getCount() {

            return datas==null?0:datas.size();
        }

        @Override
        public Object getItem(int arg0) {
            return datas==null?null:datas.get(arg0);
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return arg0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHodler hodler = null;
            if (convertView == null) {
                hodler = new ViewHodler();
                convertView = LayoutInflater.from(mContext).inflate(R.layout.item, null);
                hodler.mTextView = (TextView) convertView;
                convertView.setTag(hodler);
            } else {
                hodler = (ViewHodler) convertView.getTag();
            }
            hodler.mTextView.setText(datas.get(position));
            return convertView;
        }
        private static class ViewHodler{
            TextView mTextView;
        }

    }

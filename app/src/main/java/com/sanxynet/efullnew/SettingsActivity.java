package com.sanxynet.efullnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingsActivity extends AppCompatActivity {

    @BindView(R.id.changeBusinessNameBtn)
    Button changeBusinessName;
    @BindView(R.id.changeBusinessMailBtn)
    Button changeBusinessMail;
    @BindView(R.id.changeOfPinBtn)
    Button changeOfPin;

    @BindView(R.id.changeSupervisorPinBtn)
    Button changeSupervisorPin;
    @BindView(R.id.changeAdminPinBtn)
    Button changeAdminPin;
    @BindView(R.id.eodBtn)
    Button eod;
    @BindView(R.id.printEODBtn)
    Button printEOD;
    @BindView(R.id.reprintReceiptBtn)
    Button reprintReceipt;

    @BindView(R.id.printTransactionHistoryBtn)
    Button printTransactionHistory;
    @BindView(R.id.closeBatchBtn)
    Button closeBatch;
    @BindView(R.id.clearDatabaseBtn)
    Button clearDatabase;
    @BindView(R.id.cloudLinkBtn)
    Button cloudLink;
    @BindView(R.id.otaBtn)
    Button ota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);


    }


    @OnClick(R.id.changeBusinessNameBtn)
    public void changeBusinessName(View view) {
        // TODO submit data to server...
    }

    @OnClick(R.id.changeBusinessMailBtn)
    public void changeBusinessMail(View view) {

    }

    @OnClick(R.id.changeOfPinBtn)
    public void changeOfPin(View view) {
        // TODO submit data to server...
    }

    @OnClick(R.id.changeSupervisorPinBtn)
    public void changeSupervisorPin(View view) {

    }

    @OnClick(R.id.changeAdminPinBtn)
    public void changeAdminPin(View view) {
        // TODO submit data to server...
    }

    @OnClick(R.id.eodBtn)
    public void eod(View view) {

    }

    @OnClick(R.id.printEODBtn)
    public void printEOD(View view) {
        // TODO submit data to server...
    }

    @OnClick(R.id.reprintReceiptBtn)
    public void reprintReceipt(View view) {

    }

    @OnClick(R.id.printTransactionHistoryBtn)
    public void printTransactionHistory(View view) {
        // TODO submit data to server...
    }

    @OnClick(R.id.closeBatchBtn)
    public void closeBatch(View view) {

    }

    @OnClick(R.id.clearDatabaseBtn)
    public void clearDatabase(View view) {
        // TODO submit data to server...
    }

    @OnClick(R.id.cloudLinkBtn)
    public void cloudLink(View view) {

    }

    @OnClick(R.id.otaBtn)
    public void ota(View view) {

    }
}

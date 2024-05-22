package com.qualcomm.qti.gaiaclient;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.qualcomm.qti.gaiaclient.databinding.ActionItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.ActivityMainBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.DeviceItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.DialogStatisticsSettingsBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.DownloadFileContentBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.DownloadFileStatusBarBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FeedbackContentBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FeedbackStatusBarBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FileItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentConfigurationListBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentConnectionBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentDiscoveryBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentDownloadFileBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentEarbudFitBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentFeedbackBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentFeedbackFormBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentFilesBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentGestureConfigurationBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentGesturesBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentInformationBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentMusicProcessingBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentMusicProcessingLabelsBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentProgressBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.FragmentStatisticsListBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.GestureContextItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.GestureItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.MediaPlaybackBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.ModeItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.NoDataMessageBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.PreferenceDiscreteSliderBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.PreferenceGainBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.PreferenceLeftRightBalanceBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.PreferenceMediaBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.PreferenceModesBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.PreferenceSliderBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.PreferenceTouchpadIndicatorsBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.RingProgressBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.StatisticsCategoryItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.StatisticsStatisticItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.TagItemBindingImpl;
import com.qualcomm.qti.gaiaclient.databinding.TitleItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIONITEM = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_DEVICEITEM = 3;

  private static final int LAYOUT_DIALOGSTATISTICSSETTINGS = 4;

  private static final int LAYOUT_DOWNLOADFILECONTENT = 5;

  private static final int LAYOUT_DOWNLOADFILESTATUSBAR = 6;

  private static final int LAYOUT_FEEDBACKCONTENT = 7;

  private static final int LAYOUT_FEEDBACKFORMENTRY = 8;

  private static final int LAYOUT_FEEDBACKITEM = 9;

  private static final int LAYOUT_FEEDBACKSTATUSBAR = 10;

  private static final int LAYOUT_FILEITEM = 11;

  private static final int LAYOUT_FRAGMENTCONFIGURATIONLIST = 12;

  private static final int LAYOUT_FRAGMENTCONNECTION = 13;

  private static final int LAYOUT_FRAGMENTDISCOVERY = 14;

  private static final int LAYOUT_FRAGMENTDOWNLOADFILE = 15;

  private static final int LAYOUT_FRAGMENTEARBUDFIT = 16;

  private static final int LAYOUT_FRAGMENTFEEDBACK = 17;

  private static final int LAYOUT_FRAGMENTFEEDBACKFORM = 18;

  private static final int LAYOUT_FRAGMENTFILES = 19;

  private static final int LAYOUT_FRAGMENTGESTURECONFIGURATION = 20;

  private static final int LAYOUT_FRAGMENTGESTURES = 21;

  private static final int LAYOUT_FRAGMENTINFORMATION = 22;

  private static final int LAYOUT_FRAGMENTMUSICPROCESSING = 23;

  private static final int LAYOUT_FRAGMENTMUSICPROCESSINGLABELS = 24;

  private static final int LAYOUT_FRAGMENTPROGRESS = 25;

  private static final int LAYOUT_FRAGMENTSTATISTICSLIST = 26;

  private static final int LAYOUT_GESTURECONTEXTITEM = 27;

  private static final int LAYOUT_GESTUREITEM = 28;

  private static final int LAYOUT_MEDIAPLAYBACK = 29;

  private static final int LAYOUT_MODEITEM = 30;

  private static final int LAYOUT_NODATAMESSAGE = 31;

  private static final int LAYOUT_PREFERENCEDISCRETESLIDER = 32;

  private static final int LAYOUT_PREFERENCEGAIN = 33;

  private static final int LAYOUT_PREFERENCELEFTRIGHTBALANCE = 34;

  private static final int LAYOUT_PREFERENCEMEDIA = 35;

  private static final int LAYOUT_PREFERENCEMODES = 36;

  private static final int LAYOUT_PREFERENCESLIDER = 37;

  private static final int LAYOUT_PREFERENCETOUCHPADINDICATORS = 38;

  private static final int LAYOUT_RINGPROGRESS = 39;

  private static final int LAYOUT_STATISTICSCATEGORYITEM = 40;

  private static final int LAYOUT_STATISTICSSTATISTICITEM = 41;

  private static final int LAYOUT_TAGITEM = 42;

  private static final int LAYOUT_TITLEITEM = 43;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(43);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.action_item, LAYOUT_ACTIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.device_item, LAYOUT_DEVICEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.dialog_statistics_settings, LAYOUT_DIALOGSTATISTICSSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.download_file_content, LAYOUT_DOWNLOADFILECONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.download_file_status_bar, LAYOUT_DOWNLOADFILESTATUSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.feedback_content, LAYOUT_FEEDBACKCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.feedback_form_entry, LAYOUT_FEEDBACKFORMENTRY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.feedback_item, LAYOUT_FEEDBACKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.feedback_status_bar, LAYOUT_FEEDBACKSTATUSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.file_item, LAYOUT_FILEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_configuration_list, LAYOUT_FRAGMENTCONFIGURATIONLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_connection, LAYOUT_FRAGMENTCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_discovery, LAYOUT_FRAGMENTDISCOVERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_download_file, LAYOUT_FRAGMENTDOWNLOADFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_earbud_fit, LAYOUT_FRAGMENTEARBUDFIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_feedback, LAYOUT_FRAGMENTFEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_feedback_form, LAYOUT_FRAGMENTFEEDBACKFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_files, LAYOUT_FRAGMENTFILES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_gesture_configuration, LAYOUT_FRAGMENTGESTURECONFIGURATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_gestures, LAYOUT_FRAGMENTGESTURES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_information, LAYOUT_FRAGMENTINFORMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_music_processing, LAYOUT_FRAGMENTMUSICPROCESSING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_music_processing_labels, LAYOUT_FRAGMENTMUSICPROCESSINGLABELS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_progress, LAYOUT_FRAGMENTPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.fragment_statistics_list, LAYOUT_FRAGMENTSTATISTICSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.gesture_context_item, LAYOUT_GESTURECONTEXTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.gesture_item, LAYOUT_GESTUREITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.media_playback, LAYOUT_MEDIAPLAYBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.mode_item, LAYOUT_MODEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.no_data_message, LAYOUT_NODATAMESSAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.preference_discrete_slider, LAYOUT_PREFERENCEDISCRETESLIDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.preference_gain, LAYOUT_PREFERENCEGAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.preference_left_right_balance, LAYOUT_PREFERENCELEFTRIGHTBALANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.preference_media, LAYOUT_PREFERENCEMEDIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.preference_modes, LAYOUT_PREFERENCEMODES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.preference_slider, LAYOUT_PREFERENCESLIDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.preference_touchpad_indicators, LAYOUT_PREFERENCETOUCHPADINDICATORS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.ring_progress, LAYOUT_RINGPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.statistics_category_item, LAYOUT_STATISTICSCATEGORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.statistics_statistic_item, LAYOUT_STATISTICSSTATISTICITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.tag_item, LAYOUT_TAGITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.qualcomm.qti.gaiaclient.R.layout.title_item, LAYOUT_TITLEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIONITEM: {
          if ("layout/action_item_0".equals(tag)) {
            return new ActionItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for action_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DEVICEITEM: {
          if ("layout/device_item_0".equals(tag)) {
            return new DeviceItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for device_item is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGSTATISTICSSETTINGS: {
          if ("layout/dialog_statistics_settings_0".equals(tag)) {
            return new DialogStatisticsSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_statistics_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_DOWNLOADFILECONTENT: {
          if ("layout/download_file_content_0".equals(tag)) {
            return new DownloadFileContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for download_file_content is invalid. Received: " + tag);
        }
        case  LAYOUT_DOWNLOADFILESTATUSBAR: {
          if ("layout/download_file_status_bar_0".equals(tag)) {
            return new DownloadFileStatusBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for download_file_status_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_FEEDBACKCONTENT: {
          if ("layout/feedback_content_0".equals(tag)) {
            return new FeedbackContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for feedback_content is invalid. Received: " + tag);
        }
        case  LAYOUT_FEEDBACKFORMENTRY: {
          if ("layout/feedback_form_entry_0".equals(tag)) {
            return new FeedbackFormEntryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for feedback_form_entry is invalid. Received: " + tag);
        }
        case  LAYOUT_FEEDBACKITEM: {
          if ("layout/feedback_item_0".equals(tag)) {
            return new FeedbackItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for feedback_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FEEDBACKSTATUSBAR: {
          if ("layout/feedback_status_bar_0".equals(tag)) {
            return new FeedbackStatusBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for feedback_status_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_FILEITEM: {
          if ("layout/file_item_0".equals(tag)) {
            return new FileItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for file_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONFIGURATIONLIST: {
          if ("layout/fragment_configuration_list_0".equals(tag)) {
            return new FragmentConfigurationListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_configuration_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONNECTION: {
          if ("layout/fragment_connection_0".equals(tag)) {
            return new FragmentConnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_connection is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDISCOVERY: {
          if ("layout/fragment_discovery_0".equals(tag)) {
            return new FragmentDiscoveryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_discovery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDOWNLOADFILE: {
          if ("layout/fragment_download_file_0".equals(tag)) {
            return new FragmentDownloadFileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_download_file is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEARBUDFIT: {
          if ("layout/fragment_earbud_fit_0".equals(tag)) {
            return new FragmentEarbudFitBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_earbud_fit is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEEDBACK: {
          if ("layout/fragment_feedback_0".equals(tag)) {
            return new FragmentFeedbackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feedback is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEEDBACKFORM: {
          if ("layout/fragment_feedback_form_0".equals(tag)) {
            return new FragmentFeedbackFormBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feedback_form is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILES: {
          if ("layout/fragment_files_0".equals(tag)) {
            return new FragmentFilesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_files is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGESTURECONFIGURATION: {
          if ("layout/fragment_gesture_configuration_0".equals(tag)) {
            return new FragmentGestureConfigurationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_gesture_configuration is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGESTURES: {
          if ("layout/fragment_gestures_0".equals(tag)) {
            return new FragmentGesturesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_gestures is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINFORMATION: {
          if ("layout/fragment_information_0".equals(tag)) {
            return new FragmentInformationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_information is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMUSICPROCESSING: {
          if ("layout/fragment_music_processing_0".equals(tag)) {
            return new FragmentMusicProcessingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_music_processing is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMUSICPROCESSINGLABELS: {
          if ("layout/fragment_music_processing_labels_0".equals(tag)) {
            return new FragmentMusicProcessingLabelsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_music_processing_labels is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROGRESS: {
          if ("layout/fragment_progress_0".equals(tag)) {
            return new FragmentProgressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_progress is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTATISTICSLIST: {
          if ("layout/fragment_statistics_list_0".equals(tag)) {
            return new FragmentStatisticsListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_statistics_list is invalid. Received: " + tag);
        }
        case  LAYOUT_GESTURECONTEXTITEM: {
          if ("layout/gesture_context_item_0".equals(tag)) {
            return new GestureContextItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for gesture_context_item is invalid. Received: " + tag);
        }
        case  LAYOUT_GESTUREITEM: {
          if ("layout/gesture_item_0".equals(tag)) {
            return new GestureItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for gesture_item is invalid. Received: " + tag);
        }
        case  LAYOUT_MEDIAPLAYBACK: {
          if ("layout/media_playback_0".equals(tag)) {
            return new MediaPlaybackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for media_playback is invalid. Received: " + tag);
        }
        case  LAYOUT_MODEITEM: {
          if ("layout/mode_item_0".equals(tag)) {
            return new ModeItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mode_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NODATAMESSAGE: {
          if ("layout/no_data_message_0".equals(tag)) {
            return new NoDataMessageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for no_data_message is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCEDISCRETESLIDER: {
          if ("layout/preference_discrete_slider_0".equals(tag)) {
            return new PreferenceDiscreteSliderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_discrete_slider is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCEGAIN: {
          if ("layout/preference_gain_0".equals(tag)) {
            return new PreferenceGainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_gain is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCELEFTRIGHTBALANCE: {
          if ("layout/preference_left_right_balance_0".equals(tag)) {
            return new PreferenceLeftRightBalanceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_left_right_balance is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCEMEDIA: {
          if ("layout/preference_media_0".equals(tag)) {
            return new PreferenceMediaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_media is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCEMODES: {
          if ("layout/preference_modes_0".equals(tag)) {
            return new PreferenceModesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_modes is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCESLIDER: {
          if ("layout/preference_slider_0".equals(tag)) {
            return new PreferenceSliderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_slider is invalid. Received: " + tag);
        }
        case  LAYOUT_PREFERENCETOUCHPADINDICATORS: {
          if ("layout/preference_touchpad_indicators_0".equals(tag)) {
            return new PreferenceTouchpadIndicatorsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for preference_touchpad_indicators is invalid. Received: " + tag);
        }
        case  LAYOUT_RINGPROGRESS: {
          if ("layout/ring_progress_0".equals(tag)) {
            return new RingProgressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for ring_progress is invalid. Received: " + tag);
        }
        case  LAYOUT_STATISTICSCATEGORYITEM: {
          if ("layout/statistics_category_item_0".equals(tag)) {
            return new StatisticsCategoryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for statistics_category_item is invalid. Received: " + tag);
        }
        case  LAYOUT_STATISTICSSTATISTICITEM: {
          if ("layout/statistics_statistic_item_0".equals(tag)) {
            return new StatisticsStatisticItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for statistics_statistic_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TAGITEM: {
          if ("layout/tag_item_0".equals(tag)) {
            return new TagItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tag_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TITLEITEM: {
          if ("layout/title_item_0".equals(tag)) {
            return new TitleItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for title_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(30);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "bounds");
      sKeys.put(2, "connection");
      sKeys.put(3, "content");
      sKeys.put(4, "data");
      sKeys.put(5, "device");
      sKeys.put(6, "file");
      sKeys.put(7, "gesture");
      sKeys.put(8, "helper");
      sKeys.put(9, "information");
      sKeys.put(10, "isInProgress");
      sKeys.put(11, "isRecording");
      sKeys.put(12, "labelForValue");
      sKeys.put(13, "leftTouchpadData");
      sKeys.put(14, "max");
      sKeys.put(15, "maxValue");
      sKeys.put(16, "maximumLength");
      sKeys.put(17, "message");
      sKeys.put(18, "minValue");
      sKeys.put(19, "placeholder");
      sKeys.put(20, "progress");
      sKeys.put(21, "rate");
      sKeys.put(22, "rightTouchpadData");
      sKeys.put(23, "staticData");
      sKeys.put(24, "stepSize");
      sKeys.put(25, "text");
      sKeys.put(26, "title");
      sKeys.put(27, "value");
      sKeys.put(28, "viewData");
      sKeys.put(29, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(43);

    static {
      sKeys.put("layout/action_item_0", com.qualcomm.qti.gaiaclient.R.layout.action_item);
      sKeys.put("layout/activity_main_0", com.qualcomm.qti.gaiaclient.R.layout.activity_main);
      sKeys.put("layout/device_item_0", com.qualcomm.qti.gaiaclient.R.layout.device_item);
      sKeys.put("layout/dialog_statistics_settings_0", com.qualcomm.qti.gaiaclient.R.layout.dialog_statistics_settings);
      sKeys.put("layout/download_file_content_0", com.qualcomm.qti.gaiaclient.R.layout.download_file_content);
      sKeys.put("layout/download_file_status_bar_0", com.qualcomm.qti.gaiaclient.R.layout.download_file_status_bar);
      sKeys.put("layout/feedback_content_0", com.qualcomm.qti.gaiaclient.R.layout.feedback_content);
      sKeys.put("layout/feedback_form_entry_0", com.qualcomm.qti.gaiaclient.R.layout.feedback_form_entry);
      sKeys.put("layout/feedback_item_0", com.qualcomm.qti.gaiaclient.R.layout.feedback_item);
      sKeys.put("layout/feedback_status_bar_0", com.qualcomm.qti.gaiaclient.R.layout.feedback_status_bar);
      sKeys.put("layout/file_item_0", com.qualcomm.qti.gaiaclient.R.layout.file_item);
      sKeys.put("layout/fragment_configuration_list_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_configuration_list);
      sKeys.put("layout/fragment_connection_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_connection);
      sKeys.put("layout/fragment_discovery_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_discovery);
      sKeys.put("layout/fragment_download_file_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_download_file);
      sKeys.put("layout/fragment_earbud_fit_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_earbud_fit);
      sKeys.put("layout/fragment_feedback_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_feedback);
      sKeys.put("layout/fragment_feedback_form_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_feedback_form);
      sKeys.put("layout/fragment_files_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_files);
      sKeys.put("layout/fragment_gesture_configuration_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_gesture_configuration);
      sKeys.put("layout/fragment_gestures_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_gestures);
      sKeys.put("layout/fragment_information_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_information);
      sKeys.put("layout/fragment_music_processing_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_music_processing);
      sKeys.put("layout/fragment_music_processing_labels_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_music_processing_labels);
      sKeys.put("layout/fragment_progress_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_progress);
      sKeys.put("layout/fragment_statistics_list_0", com.qualcomm.qti.gaiaclient.R.layout.fragment_statistics_list);
      sKeys.put("layout/gesture_context_item_0", com.qualcomm.qti.gaiaclient.R.layout.gesture_context_item);
      sKeys.put("layout/gesture_item_0", com.qualcomm.qti.gaiaclient.R.layout.gesture_item);
      sKeys.put("layout/media_playback_0", com.qualcomm.qti.gaiaclient.R.layout.media_playback);
      sKeys.put("layout/mode_item_0", com.qualcomm.qti.gaiaclient.R.layout.mode_item);
      sKeys.put("layout/no_data_message_0", com.qualcomm.qti.gaiaclient.R.layout.no_data_message);
      sKeys.put("layout/preference_discrete_slider_0", com.qualcomm.qti.gaiaclient.R.layout.preference_discrete_slider);
      sKeys.put("layout/preference_gain_0", com.qualcomm.qti.gaiaclient.R.layout.preference_gain);
      sKeys.put("layout/preference_left_right_balance_0", com.qualcomm.qti.gaiaclient.R.layout.preference_left_right_balance);
      sKeys.put("layout/preference_media_0", com.qualcomm.qti.gaiaclient.R.layout.preference_media);
      sKeys.put("layout/preference_modes_0", com.qualcomm.qti.gaiaclient.R.layout.preference_modes);
      sKeys.put("layout/preference_slider_0", com.qualcomm.qti.gaiaclient.R.layout.preference_slider);
      sKeys.put("layout/preference_touchpad_indicators_0", com.qualcomm.qti.gaiaclient.R.layout.preference_touchpad_indicators);
      sKeys.put("layout/ring_progress_0", com.qualcomm.qti.gaiaclient.R.layout.ring_progress);
      sKeys.put("layout/statistics_category_item_0", com.qualcomm.qti.gaiaclient.R.layout.statistics_category_item);
      sKeys.put("layout/statistics_statistic_item_0", com.qualcomm.qti.gaiaclient.R.layout.statistics_statistic_item);
      sKeys.put("layout/tag_item_0", com.qualcomm.qti.gaiaclient.R.layout.tag_item);
      sKeys.put("layout/title_item_0", com.qualcomm.qti.gaiaclient.R.layout.title_item);
    }
  }
}

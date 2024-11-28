package miniproject.carrotmarket1.service;

import lombok.RequiredArgsConstructor;
import miniproject.carrotmarket1.entity.Report;
import miniproject.carrotmarket1.entity.ReportStatus;
import miniproject.carrotmarket1.repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;

    //신고 목록 조회(필터 기능)
    public List<Report> getReportList(String startDate, String endDate, String status) {
        return reportRepository.getReportList(startDate,endDate,status);
    }

    //신고 상세 조회
    public Report getReportById(Long id) {
        return reportRepository.getReportById(id);
    }

    //신고 처리 상태 변경
    public void updateReportStatus(Long id, ReportStatus status) {
        //id로 기존 report 조회
        Report report = reportRepository.getReportById(id);
        if(report != null){
            report.setStatus(status); //선택한 status 값으로 상태 변경 (pending -> resolved)
            if(ReportStatus.PENDING == status){
                report.setResolvedAt(null);
            }
            else{ // 처리 완료로 변경시 resolved_at에 시간 추가
                report.setResolvedAt(new Timestamp(System.currentTimeMillis()));
            }
            reportRepository.updateReportStatus(report); //DB적용
        }
        else{
            throw new IllegalArgumentException("신고 ID가 존재하지 않습니다: " + id);
        }
    }

}
